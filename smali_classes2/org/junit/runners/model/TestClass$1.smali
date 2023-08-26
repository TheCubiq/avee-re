.class Lorg/junit/runners/model/TestClass$1;
.super Ljava/lang/Object;
.source "TestClass.java"

# interfaces
.implements Lorg/junit/runners/model/MemberValueConsumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/runners/model/TestClass;->getAnnotatedFieldValues(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/junit/runners/model/MemberValueConsumer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/junit/runners/model/TestClass;

.field final synthetic val$results:Ljava/util/List;


# direct methods
.method constructor <init>(Lorg/junit/runners/model/TestClass;Ljava/util/List;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lorg/junit/runners/model/TestClass$1;->this$0:Lorg/junit/runners/model/TestClass;

    iput-object p2, p0, Lorg/junit/runners/model/TestClass$1;->val$results:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Lorg/junit/runners/model/FrameworkMember;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runners/model/FrameworkMember<",
            "*>;TT;)V"
        }
    .end annotation

    .line 232
    iget-object p1, p0, Lorg/junit/runners/model/TestClass$1;->val$results:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
