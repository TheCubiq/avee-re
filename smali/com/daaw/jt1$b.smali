.class public interface abstract Lcom/daaw/jt1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jt1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jt1$b$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/jt1$b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/jt1$b$a;->a:Lcom/daaw/jt1$b$a;

    sput-object v0, Lcom/daaw/jt1$b;->a:Lcom/daaw/jt1$b$a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Class;)Lcom/daaw/ht1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/daaw/ht1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Class;Lcom/daaw/hn;)Lcom/daaw/ht1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/daaw/ht1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/daaw/hn;",
            ")TT;"
        }
    .end annotation
.end method
