# Data Science & ML Lab


---

### 1. **NumPy**

- **Q: What is NumPy, and why is it important for data science?**
  - **A:** NumPy is a Python library used for numerical operations, crucial for data manipulation and efficient computation.

- **Q: How do you create a NumPy array?**
  - **A:** Using `np.array([elements])` to initialize a list of elements as an array.

- **Q: How does broadcasting work in NumPy?**
  - **A:** Broadcasting allows operations between arrays of different shapes by expanding smaller arrays along dimensions.

- **Q: How can you calculate the mean of an array in NumPy?**
  - **A:** Using `np.mean(array)`, which returns the average of all elements.

- **Q: What is the difference between np.array and np.arange?**
  - **A:** `np.array` creates an array from specified elements, while `np.arange` generates arrays within a given range and interval.

### 2. **Matrix Operations**

- **Q: Explain the difference between matrix multiplication and element-wise multiplication.**
  - **A:** Matrix multiplication involves the dot product between rows and columns of two matrices, while element-wise multiplication multiplies corresponding elements.

- **Q: How do you transpose a matrix in Python?**
  - **A:** Use `matrix.T` to get the transpose of a NumPy matrix.

- **Q: What are Eigenvalues and Eigenvectors?**
  - **A:** Eigenvalues are scalars associated with a matrix that represent the magnitude of transformation, and Eigenvectors represent the direction of this transformation.

- **Q: Why is matrix inversion used in data science?**
  - **A:** Matrix inversion is used to solve systems of linear equations, often applied in regression to find optimal model coefficients.

- **Q: Explain the identity matrix.**
  - **A:** An identity matrix is a square matrix with ones on the diagonal and zeroes elsewhere, acting as a neutral element in matrix multiplication.

### 3. **Matplotlib**

- **Q: What is Matplotlib used for?**
  - **A:** It is used for creating static, interactive, and animated visualizations.

- **Q: How do you plot a basic line graph using Matplotlib?**
  - **A:** Use `plt.plot(x, y)` to plot a line graph, where `x` and `y` are lists of coordinates.

- **Q: How can you label axes in a Matplotlib plot?**
  - **A:** Use `plt.xlabel('x-axis label')` and `plt.ylabel('y-axis label')`.

- **Q: How do you add a legend to a plot?**
  - **A:** Use `plt.legend(['label'])` to add a legend to the plot, specifying the label.

- **Q: What’s the purpose of `plt.show()`?**
  - **A:** `plt.show()` displays the plot window after setting up the plot specifications.

### 4. **Pandas**

- **Q: What are Series and DataFrames in Pandas?**
  - **A:** Series is a one-dimensional labeled array, and DataFrame is a two-dimensional, labeled data structure.

- **Q: How would you handle missing data in a DataFrame?**
  - **A:** Using methods like `dropna()` to remove missing values or `fillna()` to replace them with specific values.

- **Q: How can you merge two DataFrames?**
  - **A:** Use `pd.merge(df1, df2, on='column')` to merge two DataFrames on a specified column.

- **Q: How do you filter data in a DataFrame?**
  - **A:** You can filter using conditional statements, e.g., `df[df['column'] > value]`.

- **Q: What is the difference between `.loc` and `.iloc` in Pandas?**
  - **A:** `.loc` is label-based, while `.iloc` is index-based for accessing rows and columns.

### 5. **K-Nearest Neighbors (KNN)**

- **Q: What is the KNN algorithm?**
  - **A:** KNN is a supervised machine learning algorithm used for classification and regression based on the `k` nearest neighbors.

- **Q: How does K affect the KNN model’s performance?**
  - **A:** A small `k` value may lead to noise sensitivity, while a large `k` value smooths boundaries.

- **Q: Which distance metric is commonly used in KNN?**
  - **A:** The Euclidean distance is commonly used, but other metrics like Manhattan or Minkowski distances can also be applied.

- **Q: What are some advantages of KNN?**
  - **A:** KNN is simple, easy to implement, and non-parametric, meaning it makes no assumption about the underlying data distribution.

- **Q: What is a drawback of the KNN algorithm?**
  - **A:** KNN can be computationally expensive, especially on large datasets, as it needs to compute distances for each prediction.

### 6. **Decision Tree**

- **Q: What is a Decision Tree?**
  - **A:** A flowchart-like structure used for classification and regression, where each node represents a feature or decision rule.

- **Q: Explain overfitting in decision trees.**
  - **A:** Overfitting happens when the model captures noise from the training data, affecting its generalization ability.

- **Q: What is pruning in decision trees?**
  - **A:** Pruning removes branches that have little predictive power to prevent overfitting.

- **Q: What is Gini Impurity?**
  - **A:** Gini Impurity measures the impurity or randomness of data split, with lower values indicating purer nodes.

- **Q: How is entropy used in decision trees?**
  - **A:** Entropy measures the information gain, and nodes with lower entropy are preferred for optimal splitting.

### 7. **Naive Bayes**

- **Q: What is Naive Bayes, and why is it called "naive"?**
  - **A:** Naive Bayes is a probabilistic classifier assuming feature independence, hence the "naive" assumption.

- **Q: When is Naive Bayes commonly used?**
  - **A:** Commonly used for text classification, spam detection, and sentiment analysis.

- **Q: What are the main types of Naive Bayes algorithms?**
  - **A:** The main types include Gaussian, Multinomial, and Bernoulli Naive Bayes, each suited to different types of data.

- **Q: What is Bayes' theorem?**
  - **A:** Bayes' theorem calculates the probability of a hypothesis given observed evidence, foundational to the Naive Bayes algorithm.

- **Q: Why is Naive Bayes fast?**
  - **A:** Due to its simple structure and the independence assumption, Naive Bayes has a low computational complexity.

### 8. **Linear Regression**

- **Q: What is Linear Regression?**
  - **A:** Linear Regression is used to predict a target variable by modeling the relationship between independent and dependent variables as a straight line.

- **Q: How do you interpret the coefficients in a linear regression model?**
  - **A:** Coefficients indicate how much the dependent variable changes with a one-unit change in the predictor.

- **Q: What is the difference between simple and multiple linear regression?**
  - **A:** Simple linear regression involves one predictor, while multiple regression includes multiple predictors.

- **Q: What is the cost function in linear regression?**
  - **A:** The cost function, often mean squared error, measures the difference between predicted and actual values.

- **Q: How is linear regression optimized?**
  - **A:** By minimizing the cost function, usually through gradient descent or other optimization algorithms.

### 9. **K-Means Clustering**

- **Q: What is the K-Means algorithm?**
  - **A:** K-Means is an unsupervised algorithm that partitions data into `k` clusters by iterating centroid adjustments.

- **Q: How do you determine the optimal number of clusters in K-Means?**
  - **A:** The "elbow method" is commonly used to find the point of diminishing returns on within-cluster sum of squares.

- **Q: What is the role of centroids in K-Means?**
  - **A:** Centroids represent the center of each cluster and are adjusted iteratively to minimize intra-cluster distances.

- **Q: What are some limitations of K-Means?**
  - **A:** K-Means is sensitive to outliers, requires a pre-defined `k`, and may converge to local minima.

- **Q: How is K-Means initialized?**
  - **A:** Common methods include random initialization and k-means++, which helps in choosing better starting centroids.

### 10. **Support Vector Machine (SVM)**

- **Q: What is the purpose of the Support Vector Machine (SVM) algorithm?**
  - **A:** SVM aims to find the hyperplane that best separates classes, maximizing the margin between classes.

- **Q: Explain the role of the kernel function in SVM.**
  - **A:** The kernel function transforms data to a higher-dimensional space to make it linearly separable.

- **Q: What is a support vector in SVM?**
  - **A:** Support vectors are data points closest to the hyperplane, crucial in defining the margin.

- **Q: What are some types of SVM kernels?**
  - **A:** Common kernels include linear, polynomial, radial basis function (RBF), and sigmoid.

- **Q: How does SVM handle non-linear data?**
  - **A:** SVM uses kernel functions to map data to a higher-dimensional space, making it linearly separable.

### 11. **Convolutional Neural Networks (CNN)**

- **Q: What are Convolutional Neural Networks (CNNs)?**
  - **A:** CNNs are deep learning models widely used for image processing tasks, with layers that detect spatial hierarchies.

- **Q: What is a convolutional layer?**
  - **A:** The convolutional layer applies filters to input images, creating feature maps that represent various aspects of the input.

- **Q: How does pooling work in CNNs?**
  - **A:** Pooling reduces spatial dimensions, retaining essential features and improving computational efficiency.

- **Q: Explain the concept of filters in CNNs.**
  - **A:** Filters, or kernels, slide across the image to extract specific patterns such as edges, textures, or shapes.

- **Q: What are some applications of CNNs?**
  - **A:** CNNs are used in object detection, image segmentation, facial recognition, and more.

---







# Mobile App Development Lab
